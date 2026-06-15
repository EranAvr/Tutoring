function AuthChecker(req, res, next){
    // פרטיי דמו
    const USERNAME = "Bob";
    const PASSWORD = "1234";

    if(req.body.username !== USERNAME || req.body.password !== PASSWORD)
        return res.status(401).send("You are a loser!");

    next();
}

export default AuthChecker;