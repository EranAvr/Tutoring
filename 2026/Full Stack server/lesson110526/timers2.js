const toID = setTimeout(()=>console.log("Call timeout"),1000);
//console.log(toID);

clearTimeout(toID); // פונ' ביטול תהליך שרץ ברקע


const ivID = setInterval(()=>console.log("Call timeout"),1000);

clearInterval(ivID);

console.log("End of code");