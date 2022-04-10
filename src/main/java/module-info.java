module br.edu.femass.sistemabiblioteca {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.edu.femass.sistemabiblioteca to javafx.fxml;
    exports br.edu.femass.sistemabiblioteca;
    exports br.edu.femass.sistemabiblioteca.gui;
    opens br.edu.femass.sistemabiblioteca.gui to javafx.fxml;
}