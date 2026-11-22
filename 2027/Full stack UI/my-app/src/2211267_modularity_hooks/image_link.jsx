export function ImageLink(props){

    return(
        <a href={props.href}>
            <img src={props.src} alt={props.alt} />
        </a>
    );
}

export function ImageLink({href, src, alt}){

    return(
        <a href={href}>
            <img src={src} alt={alt} />
        </a>
    );
}