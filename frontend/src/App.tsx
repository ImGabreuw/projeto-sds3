import DataTable from "components/DataTable";
import Footer from "components/Footer";
import Navbar from "components/NavBar";

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <h1 className="text-primary">Olá mundo!</h1>

        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
