import React from 'react';
import PanelA from './PanelA'
import PanelB from './PanelB'
import PanelC from './PanelC'
import PanelD from './PanelD'

const person = {
  fname: 'Kari', 
  lname: 'Nordmann'
}

const employee = {
  name: 'Jane Doe',
  salary: 20_000,
  skills: ['Spring Boot', 'React', 'TypeScript']
}

export default function App() {
  return (
    <React.Fragment>
      
      <PanelA />
      
      <PanelB msg="Hello!" />

      <PanelC fname="Kari" lname="Nordmann" />
      <PanelC fname={person.fname} lname={person.lname} />
      <PanelC {...person} />
      
      <PanelD {...employee} />
    
    </React.Fragment>
  )
}