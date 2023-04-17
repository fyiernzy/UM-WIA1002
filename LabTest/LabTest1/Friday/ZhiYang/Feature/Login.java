package Friday.Feature;

import java.util.*;
import Friday.Data.*;

public class Login extends Feature<Coordinate> {
    public Login(List<Data<Coordinate>> data) {
        super(data);
    }

    @Override
    public Login dataCleaning() {
        List<Data<Coordinate>> dataList = dataList();
        dataList.removeIf(data -> data == null || data.getData() == null || !data.getData().isValidCoordinate());
        return this;
    }
}

