import org.junit.jupiter.api.Test;
import pojos.*;

public class PojoWithLombokTest {

    @Test
    public void test(){
        Table table = new Table();
        table.setMaterial("wood");
        table.getType();

        //Board board = new Board(); // mamy AllArgsConstructor - nie mamy NoArgsConstructor, wiec:
        Board board1 = new Board("wood", "kitchen table"); // i:
        Board board2 = Board.builder()
                .material("wood")
                .type("kitchen table")
                .build();             // lub:
        Board board3 = Board.builder()
                .material("wood")
                .build();

        Chair chair = new Chair();

        Armchair armchair = new Armchair();
        armchair.setMaterial("wood");
        armchair.getMaterial();   /* tutaj mamy @Data i @Getter i @Setter  - czyli
         adnotacje sie jakby dubluja - widze, ze nie sprawia to problemu (?) */

        //Cupboard cupboard = new Cupboard(); // - brak konstruktora
        Cupboard cupboard1 = Cupboard.builder().build();

        //Sofa sofa = new Sofa();
        Sofa sofa1 = Sofa.builder()
                .material("material")
                .build();
    }
}
