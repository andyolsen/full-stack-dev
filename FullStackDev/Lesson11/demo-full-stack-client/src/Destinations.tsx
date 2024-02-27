import React from "react";
import { Link } from "react-router-dom";
import { RestClient } from "./RestClient"

export default function Destinations() {

	// React.useState() is how functional components store state inside React,
	// i.e. it lasts beyond the end of this function).
	//
	// React.useState() returns an array of 2 elements:
    //  - element [0] is a handle to the state date inside React.
	//  - element [1] is a handle to a function inside React, we can call to tell React state has changed.
	//
	// Whenever a component tells React to update its state, 
	// React will automatically re-render the component with its new state.
	let [destinations, setDestinations] = React.useState<Array<any>>([])

	// React.useEffect() is an "effect hook", i.e. code that is executed after rendering.
	//
	// The [] a list of dependencies. 
	// If any of these dependencies has changed, the effect hook will be executed after the next render.
	//
	// An empty [] causes the effect to be executed only after the FIRST render, 
	// i.e. it's like "one-off initialization".   
	React.useEffect(() => {
		RestClient.getDestinations()
				  .then(destinations => setDestinations(destinations))
	}, [])

	return (
		<div>
			<h1>Destinations</h1>
			{destinations.map((dest: any, i: number) =>
				<Link to={`destination/${dest.id}`} key={i} className='blockLink'>{dest.place}</Link>
			)}
		</div>
    )
}