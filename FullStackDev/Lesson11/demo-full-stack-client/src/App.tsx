import React from 'react';
import { Switch, Route } from 'react-router-dom';
import Menu from './Menu';
import Home from './Home';
import Destinations from './Destinations';
import Destination from './Destination';
import About from './About';
import PageNotFound from './PageNotFound';

export default function App() {
  return (
    <div>

      <Menu/>

      <Switch>

        <Route exact path="/" >
          <Home />
        </Route>
        
        <Route path="/destinations">
          <Destinations />
        </Route>

        <Route path="/destination/:id">   {/* Parameterized route */ }
          <Destination />
        </Route>

        <Route path="/about">
          <About />
        </Route>

        <Route path="*" >
          <PageNotFound />
        </Route>
        
      </Switch>
    </div>  
  );
}