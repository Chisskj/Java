package vemanhinh;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class ItemController {
    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLable;

    @FXML
    private ImageView img;

    @FXML
    private void click() {
        myListener.onClickListener(member);
    }

    private Member member;
    private MyListener myListener;

    public void setData(Member member, MyListener myListener) {
        this.member = member;
        this.myListener = myListener;
        nameLabel.setText(member.getName());
        priceLable.setText(member.getPrice() + Draw.Contribute);
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(member.getImgSrc())));
        img.setImage(image);
    }
}
