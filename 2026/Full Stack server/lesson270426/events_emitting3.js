const EventEmitter = require('events');


class TicketManager extends EventEmitter{
    constructor(count){
        super() // תמיד בשורה הראשונה נקרא לבנאי של האבא
        this.ticketCount = count;
    }

    buy(){
        if(this.ticketCount > 0){
            this.ticketCount--;
            //console.log("Buy ticket");
            this.emit('buy');
        }
        else {
            this.emit('soldOut');   // הפעלת אירוע "גמר כרטיסים"
        }
    }
}


// קוד שימוש במחלקה
const manager = new TicketManager(3);    // הגדרת אובייקט מנהל

manager.on('buy', ()=>{console.log("Ticket was bought");});

manager.on('soldOut', ()=>{console.log("Let everyone know we're out of tickets");
});

manager.buy()
manager.buy()
manager.buy()
manager.buy()   // בפעם הרביעית נגיע לאירוע גמר'


const manager2 = new TicketManager(300);    // הגדרת אובייקט מנהל
manager.on('buy', ()=>{"Ask for another purchase"})
