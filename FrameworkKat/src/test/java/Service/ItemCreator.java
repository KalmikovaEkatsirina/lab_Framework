package Service;

import Model.Item;

public class ItemCreator {
    private static final String JACKET_NAME="test.JacketName";
    private static final String JACKET_SIZE="test.JacketSize";
    private static final String DRESS_NAME="test.DressName";
    private static final String DRESS_SIZE="test.DressSize";
    public static Item CreateJacket(){
        return new Item("СТЕГАНАЯ КУРТКА С ВОРОТНИКОМ-СТОЙКОЙ",TestDataReader.getTestData(JACKET_SIZE));
    }
    public static Item createDress(){
        return new Item("КОРОТКОЕ КРАСНОЕ ПЛАТЬЕ ИЗ ПОЛУПРОЗРАЧНОЙ ТКАНИ",TestDataReader.getTestData(DRESS_SIZE));
    }
}
