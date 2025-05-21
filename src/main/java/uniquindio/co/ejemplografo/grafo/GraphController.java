package uniquindio.co.ejemplografo.grafo;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Arrays;
import java.util.List;

public class GraphController {

    @FXML
    private Pane pane;

    public void initialize() {
        Node a = new Node("A", 100, 100);
        Node b = new Node("B", 300, 100);
        Node c = new Node("C", 200, 250);

        List<Node> nodes = Arrays.asList(a, b, c);
        List<Edge> edges = Arrays.asList(
                new Edge(a, b),
                new Edge(b, c),
                new Edge(c, a)
        );

        for (Edge edge : edges) {
            Line line = new Line(edge.from.x, edge.from.y, edge.to.x, edge.to.y);
            pane.getChildren().add(line);
        }

        for (Node node : nodes) {
            Circle circle = new Circle(node.x, node.y, 20, Color.LIGHTBLUE);
            circle.setStroke(Color.BLACK);
            Text label = new Text(node.x - 5, node.y + 5, node.id);
            pane.getChildren().addAll(circle, label);
        }
    }

    // Node y Edge son clases internas o importadas, deben existir en el mismo paquete
}
