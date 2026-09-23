import { useState } from "react";
import { useLocation, useNavigate } from "react-router-dom";

function ResetPassword() {

    const location = useLocation();
    const navigate = useNavigate();

    // Get email received from VerifyOtp page
    const email = location.state?.email;

    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");


    const resetPassword = async () => {

        // Frontend check
        if (password !== confirmPassword) {
            alert("Passwords do not match");
            return;
        }

        const response = await fetch(
            "http://localhost:8080/auth-backend/api/auth/reset-password",
            {
                method: "POST",

                headers: {
                    "Content-Type": "application/json"
                },

                // Only email and password go to backend
                body: JSON.stringify({
                    email: email,
                    password: password
                })
            }
        );

        const result = await response.text();

        if (result === "Password reset successful") {

            alert("Password reset successful");

            navigate("/login");

        } else {

            alert(result);
        }
    };


    return (
        <div className="reset-password-container" id="reset-password">

            <h1 className="reset-password-title">Create New Password</h1>

            <p className="reset-password-text">Email: {email}</p>

            <input
                className="reset-password-input"
                type="password"
                placeholder="New Password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
            />

            <br />

            <input
                className="reset-password-input"
                type="password"
                placeholder="Confirm Password"
                value={confirmPassword}
                onChange={(e) => setConfirmPassword(e.target.value)}
            />

            <br />

            <button className="reset-password-btn" onClick={resetPassword}>
                Reset Password
            </button>

        </div>
    );
}

export default ResetPassword;