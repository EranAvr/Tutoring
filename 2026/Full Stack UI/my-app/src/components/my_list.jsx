
export default function MyList(){

    const items = ["Tel Aviv", "Jerusalem", "Kiryat Shemona"];

    return(
        <ul>
            <li> {items[0]} </li>
            <li> {items[1]} </li>
            <li> {items[2]} </li>
        </ul>
    );
}