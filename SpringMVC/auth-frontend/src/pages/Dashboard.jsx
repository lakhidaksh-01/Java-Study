import { useNavigate } from "react-router-dom";

function Dashboard() {

    const navigate = useNavigate();

    return (
        <div className="dashboard-container" id="dashboard">

            <h1 className="dashboard-title">Dashboard</h1>

            <h2 className="dashboard-welcome">Welcome!</h2>

            <p className="dashboard-text">You have successfully logged in.</p>

            <button className="dashboard-logout-btn" onClick={() => navigate("/login")}>
                Logout
            </button>

        </div>
    );
}

export default Dashboard;