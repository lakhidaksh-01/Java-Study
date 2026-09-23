import { useState } from "react";
import { useNavigate } from "react-router-dom";

function Register() {

    const navigate = useNavigate();

    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [phone, setPhone] = useState("");
    const [password, setPassword] = useState("");

    const registerUser = async () => {

        const response = await fetch(
            "http://localhost:8080/auth-backend/api/auth/register",
            {
                method: "POST",

                headers: {
                    "Content-Type": "application/json"
                },

                body: JSON.stringify({
                    name: name,
                    email: email,
                    phone: phone,
                    password: password
                })
            }
        );

        const result = await response.text();

        alert(result);

        if (result === "Registration successful") {
            navigate("/login");
        }
    };


    return (
        <div className="register-container" id="register">

            <h1 className="register-title">Register</h1>

            <input
                className="register-input"
                type="text"
                placeholder="Name"
                value={name}
                onChange={(e) => setName(e.target.value)}
            />

            <br />

            <input
                className="register-input"
                type="email"
                placeholder="Email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
            />

            <br />

            <input
                className="register-input"
                type="text"
                placeholder="Phone"
                value={phone}
                onChange={(e) => setPhone(e.target.value)}
            />

            <br />

            <input
                className="register-input"
                type="password"
                placeholder="Password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
            />

            <br />

            <button className="register-btn" onClick={registerUser}>
                Register
            </button>

            <br />

            <button className="register-link-btn" onClick={() => navigate("/login")}>
                Go to Login
            </button>

        </div>
    );
}

export default Register;