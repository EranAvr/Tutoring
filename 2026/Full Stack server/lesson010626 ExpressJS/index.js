// Part I - Create object
import express from 'express';
const app = express();  // A server application


// Part II - configurations הגדרות
app.get('/', (req, res) => {
    res.send("Primary domain endpoint");
});

app.get('/about', (req, res) => {
    // ניצור אובייקט JS רגיל
    const obj = {
        name: "Test Server",
        country: "Israel"
    };
    // המרה מאובייקט ל-JSON
    const jsn = JSON.stringify(obj);
    // שליחה חזרה כתשובה
    res.json(jsn);
});

// הנתיב הבא נראה כמו שם קובץ אבל (!!) הוא נתיב רגיל לחלוטין
// הפעולות שנבצע בתוך הפונ' הן אלה שקובעות כיצד מתנהג הנתיב
app.get('/file.txt', (req, res) => {
    res.send("Endpoint with file extension");
});

app.get(/.*fy$/, (req, res) => {
    res.send("You hit an /.*fy$/ endpoint");
});

// בחירת סטטוס באופן ידני. הסטטוס משפיע על התנהגות התשובה
// בנתיב הבא, הטקסט בכלל לא ישלח אל הלקוח כי 204 אומר "אין תוכן להחזרה" א
app.get("/dead-end", (req, res) => {
    res.status(204).send("Nothing to send back");
});

// ניתוב מחדש מכתובת ישנה אל כתובת חדשה
app.get('/old-market', (req, res) => {
    res.redirect('/new-market');
});
app.get('/new-market', (req, res) => {
    res.send("Our New Marketplace Page");
});

// שרשור נתיבים
// ניתן לקבוע מתודות שונות לאותה הכתובת
/*app.get('/book', (req, res) => {
    res.send("Get book info");
});
app.post('/book', (req, res) => {
    res.send("Book added to archive");
});*/
app.route('/book')
    .get((req, res) => {
        res.send("Get book info");
    })
    .post((req, res) => {
        res.send("Book added to archive");
    });

// קבלת פרמטרים
// query parameters
app.get('/query', (req, res) => {
    const params = req.query;
    res.json(JSON.stringify(params));
});
// path parameters
app.get('/params/:id', (req, res) => {
    res.send(req.params.id)
});


// Part III - run app הרצה
app.listen(3000, () => {
    console.log("Server is running...");
});