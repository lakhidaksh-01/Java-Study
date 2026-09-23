import { useState } from "react";
import { useLocation, useNavigate } from "react-router-dom";

function VerifyOtp() {

    const location = useLocation();
    const navigate = useNavigate();

    const email = location.state?.email;

    const [otp, setOtp] = useState("");


    const verifyOtp = async () => {

        const response = await fetch(
            "http://localhost:8080/auth-backend/api/auth/verify-otp",
            {
                method: "POST",

                headers: {
                    "Content-Type": "application/json"
                },

                body: JSON.stringify({
                    email: email,
                    otp: otp
                })
            }
        );

        const result = await response.text();

        alert(result);

       if (result === "OTP verified") {

    navigate("/reset-password", {
        state: {
            email: email
        }
    });

}
    };


    return (
        <div className="verify-otp-container" id="verify-otp">

            <h1 className="verify-otp-title">Verify OTP</h1>

            <p className="verify-otp-text">OTP sent to: {email}</p>

            <input
                className="verify-otp-input"
                type="text"
                placeholder="Enter OTP"
                value={otp}
                onChange={(e) => setOtp(e.target.value)}
            />

            <br />

            <button className="verify-otp-btn" onClick={verifyOtp}>
                Verify OTP
            </button>

        </div>
    );
}

export default VerifyOtp;