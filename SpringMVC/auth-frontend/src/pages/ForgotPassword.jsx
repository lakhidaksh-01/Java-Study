import { useState } from "react";
import { useNavigate } from "react-router-dom";

function ForgotPassword() {

    const navigate = useNavigate();

    const [email, setEmail] = useState("");


    const sendOtp = async () => {

        const response = await fetch(
            "http://localhost:8080/auth-backend/api/auth/forgot-password",
            {
                method: "POST",

                headers: {
                    "Content-Type": "application/json"
                },

                body: JSON.stringify({
                    email: email
                })
            }
        );

        const result = await response.text();

        alert(result);

        if (result === "OTP generated") {

            navigate("/verify-otp", {
                state: {
                    email: email
                }
            });
        }
    };


    return (
        <div className="forgot-password-container" id="forgot-password">

            <h1 className="forgot-password-title">Forgot Password</h1>

            <input
                className="forgot-password-input"
                type="email"
                placeholder="Enter your email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
            />

            <br />

            <button className="forgot-password-btn" onClick={sendOtp}>
                Send OTP
            </button>

            <br />

            <button className="forgot-password-link-btn" onClick={() => navigate("/login")}>
                Back to Login
            </button>

        </div>
    );
}

export default ForgotPassword;