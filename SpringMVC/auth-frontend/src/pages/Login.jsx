import { useState } from "react";
import { useNavigate } from "react-router-dom";

function Login() {

    const navigate = useNavigate();

    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");


    const loginUser = async () => {

        const response = await fetch(
            "http://localhost:8080/auth-backend/api/auth/login",
            {
                method: "POST",

                headers: {
                    "Content-Type": "application/json"
                },

                body: JSON.stringify({
                    email: email,
                    password: password
                })
            }
        );

        const result = await response.text();

        alert(result);

        if (result === "Login successful") {
            navigate("/dashboard");
        }
    };


    return (
        <div className="login-container" id="login">

            <h1 className="login-title">Login</h1>

            <input
                className="login-input"
                type="email"
                placeholder="Email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
            />

            <br />

            <input
                className="login-input"
                type="password"
                placeholder="Password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
            />

            <br />

            <button className="login-btn" onClick={loginUser}>
                Login
            </button>

            <br />

            <button className="login-link-btn" onClick={() => navigate("/register")}>
                Create Account
            </button>

            <br />

            <button className="login-link-btn" onClick={() => navigate("/forgot-password")}>
                Forgot Password?
            </button>

        </div>
    );
}

export default Login;