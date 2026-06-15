function Logger(req, res, next){
    // עבודה: רישום לוג למסך
    if (req.method == "POST")
        console.log(">>", req.body);

    // העברת שליטה אל הפונ' הבאה
    // יכולה להיות מתווך אחר, או פונ' הנתיב
    next();
}

export default Logger;