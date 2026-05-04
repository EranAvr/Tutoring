
export function greet(name){
    console.log("Hello " + name);
}
export function sayGoodbye(name){
    console.log("Good bye " + name);
}

export default function decorate(name){
    return "@@" + name + "@@";
}