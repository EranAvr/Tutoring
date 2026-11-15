export default function ImageLink(props){

    return(
        <a href={props.href}>
            <img src={props.src} alt={props.alt} />
        </a>
    );
}