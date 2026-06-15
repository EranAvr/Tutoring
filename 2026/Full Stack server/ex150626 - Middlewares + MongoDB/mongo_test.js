import { MongoClient } from 'mongodb';
import 'dotenv/config';

/*const client = new MongoClient(process.env.MONGO_URI);


let dbConnection;

export const connectDB = async () => {
  try {
    await client.connect();
    dbConnection = client.db(); // Connects to the database specified in URI
    console.log("Successfully connected to MongoDB native driver.");
    return dbConnection;
  } catch (error) {
    console.error("Database connection error:", error);
    process.exit(1);
  }
};

export const getDb = () => dbConnection;*/





const client = new MongoClient(process.env.MONGO_URI);

await client.connect();
let dbConnection = client.db(); // Connects to the database specified in URI

console.log(dbConnection);


const users = dbConnection.collection("users");


// הוספת רשומה חדשה
await users.insertOne({username: "Bob", password: "1234"})

// איתור רשומה קיימת
const user = await users.findOne({username: "Bob"});
console.log(user);

const user2 = await users.findOne({username: "Bobby"});
console.log(user2);

const user3 = await users.findOne({username: "Bo"});
console.log(user3);

// עדכון רשומה קיימת
users.updateOne({username: "Bob"}, {$set: {password: 4321}});

// מחיקת רשומה
await users.deleteMany({username: "Bob"});


console.log("End of Script!");
