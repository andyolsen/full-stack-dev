import React from "react";
import { NavLink } from "react-router-dom";
import "./Menu.css";

export default function Menu() {
    return (
		<nav>
			<NavLink exact to="/">Home</NavLink>&nbsp;|&nbsp;
			<NavLink to="/destinations">Destinations</NavLink>&nbsp;|&nbsp;
			<NavLink to="/about">About</NavLink>
		</nav>
    )
}