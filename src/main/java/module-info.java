module uniquindio.co.ejemplografo.grafo {
    requires javafx.controls;
    requires javafx.fxml;


    opens uniquindio.co.ejemplografo.grafo to javafx.fxml;
    exports uniquindio.co.ejemplografo.grafo;
}