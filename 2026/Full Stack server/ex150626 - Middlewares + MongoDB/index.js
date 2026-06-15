import express from 'express';
import Logger from './middlewares/logger_middleware.js';
import FileLogger from './middlewares/file_logger_middleware.js';
import router from './routers/auth_router.js';

const app = express();


// Built-in middlewares
app.use(express.json());

// Custom middlewares
app.use(Logger);
app.use((req, res, next) => {
    // נבצע עבודה כלשהי...
    next()
});
app.use(FileLogger);



// חיבור ראוטר של נתיבים אל האפליקציה
app.use("/auth", router);




app.get("/test", (req, res)=>{
    res.send("Testing is good!");
})


app.post("/posting", (req, res)=>{
    console.log("/posting is working");

    res.send("All is good");
});

app.post("/login", (req, res)=>{
    
    res.send("Login successfully: " + req.body.username);
});



app.listen(3000, ()=>{
    console.log("Server is running...");
});