/*
    הרצת תהליך אסינכרוני באינטרוולים,
    וכיבוי שלו באופן אסינכרוני מתהליך חד פעמי
    שיקרה בעתיד.

    עובד! אבל היינו מעדיפים בקרה פנימי
*/

/*let count = 1;
const id = setInterval(()=>console.log(`#${count++}`), 1000);

setTimeout(()=>{
    clearInterval(id);
    console.log("Intervals were turned off");
}, 4500);*/


let count = 1;
const id = setInterval(
    ()=>{
        console.log(`#${count++}`)
        if (count == 5){
            clearInterval(id);
        }
}, 1000);