import { useState } from "react";
import userStore from "./user";

export default function UserDetails() {

    const [userName, setUserName] = useState("");
    const [userImgURL, setUserImgURL] = useState("");

    function updateUserDetails(){
        // save into store-
        userStore.changeUserName = userName;
        userStore.changeImageURL = userImgURL;
        // reset fields-
        setUserName("");
        setUserImgURL("");
    }

    return (
        <div>
            <h3>Present User Settings</h3>
            <p>
                This section reads data straight from the MobX store
            </p>
            <span>User Name: {userStore.readUserName}</span> <br />
            <span>User ID: {userStore.presentUserId}</span> <br />
            <img src={userStore.readUserImage} alt="No image was given" />
            <br />
            <h4>Update User Settings</h4>
            <p>
                This section writes data straight into the temp-fields
            </p>
            <div>
                <input
                    value={userName}
                    onChange={({ target }) => {
                        setUserName(target.value);
                    }}
                    type="text"
                    placeholder="Change username"
                />{" "}
                <br />
                <input
                    value={userImgURL}
                    onChange={({ target }) => {
                        setUserImgURL(target.value);
                    }}
                    type="text"
                    placeholder="Change profile image"
                />
                <br />
                <button onClick={updateUserDetails}>Save</button>
            </div>
        </div>
    );
}
