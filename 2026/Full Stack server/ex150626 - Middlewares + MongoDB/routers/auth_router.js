import express from "express";
import AuthChecker from "../middlewares/auth_middleware.js"

const router = express.Router();


router.use(AuthChecker);


router.post("/secret", (req, res)=>{
    res.send("Secret route reached");
});

export default router;