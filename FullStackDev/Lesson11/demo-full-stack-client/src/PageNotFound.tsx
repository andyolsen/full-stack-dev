import React from "react";
import './PageNotFound.css'
import { Link } from "react-router-dom";

export default function PageNotFound() {
    return (
	<div className="pagenotfound">
		<h1>OOPS 404</h1>
		<p>Invalid URL: {window.location.pathname}</p>
		<p>Full URL: {window.location.href}</p>
		<p><Link to="/">Home</Link></p>
	</div>
    )
}
