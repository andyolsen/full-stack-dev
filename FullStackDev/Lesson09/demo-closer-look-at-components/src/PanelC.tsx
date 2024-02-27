export default function PanelC(props: any) {
  const fname = props.fname
  const lname = props.lname
  return (
    <div className="panelC">
      Hello from PanelC component, 
      first name <b>{fname}</b>, 
      last name <b>{lname}</b>
    </div>
  )
}