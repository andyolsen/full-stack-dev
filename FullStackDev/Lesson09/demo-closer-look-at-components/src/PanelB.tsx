export default function PanelB(props: any) {
  const msg = props.msg
  return (
    <div className="panelB">
      Hello from PanelB component with message <b>{msg}</b>
    </div>
  )
}