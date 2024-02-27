import React from "react";
import './Home.css'
import splash from './swanseamarina.jpg';   // Tell Webpack this code file uses this image

export default function Home() {
    return (
	<div className="container">
		<img src={splash} alt="Traveller's Handbook"/>
		<div className="centered">Traveller's Handbook</div>
	</div>
    )
}