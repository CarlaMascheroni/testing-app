package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.RegisterConstants;
import com.crowdar.examples.constants.ProductsConstants;
import com.google.j2objc.annotations.Weak;

public class ProductsService extends MobileActionManager {

    public static void registerNewProduct(String NameProduct, String DescriptionProduct, String PriceProduct){
        waitClickable(ProductsConstants.INPUT_PRODUCT_NAME);
        click(ProductsConstants.INPUT_PRODUCT_NAME);
        setInput(ProductsConstants.INPUT_PRODUCT_NAME, NameProduct);
        waitClickable(ProductsConstants.INPUT_PRODUCT_DESCRIPTION);
        click(ProductsConstants.INPUT_PRODUCT_DESCRIPTION);
        setInput(ProductsConstants.INPUT_PRODUCT_DESCRIPTION, DescriptionProduct);
        waitClickable(ProductsConstants.INPUT_PRODUCT_PRICE);
        click(ProductsConstants.INPUT_PRODUCT_PRICE);
        setInput(ProductsConstants.INPUT_PRODUCT_PRICE, PriceProduct);

    }

    public static void goToNewProducts(){
        waitClickable(ProductsConstants.BUTTON_PRODUCTS);
        click(ProductsConstants.BUTTON_PRODUCTS);
    }

    public static void selectedCategory(){
        waitClickable(ProductsConstants.DROP_CATEGORY);
        click(ProductsConstants.DROP_CATEGORY);
        click(ProductsConstants.SELECT_CATEGORY);
    }

    public static void selectedImages(String image1, String image2, String image3){
        click(ProductsConstants.SELECT_IMAGE1);
        click(RegisterConstants.BUTTON_GALERY);
        click(RegisterConstants.SEARCH_IMAGE);
        setInput(RegisterConstants.SEARCH_IMAGE_INPUT, image1);
        click(ProductsConstants.IMAGEN_SELECTED);

        click(ProductsConstants.SELECT_IMAGE2);
        click(RegisterConstants.BUTTON_GALERY);
        click(RegisterConstants.SEARCH_IMAGE);
        setInput(RegisterConstants.SEARCH_IMAGE_INPUT, image2);
        click(ProductsConstants.IMAGEN_SELECTED);

        click(ProductsConstants.SELECT_IMAGE3);
        click(RegisterConstants.BUTTON_GALERY);
        click(RegisterConstants.SEARCH_IMAGE);
        setInput(RegisterConstants.SEARCH_IMAGE_INPUT, image3);
        click(ProductsConstants.IMAGEN_SELECTED);
    }

    public static void clickCreatedProduct(){
        waitClickable(ProductsConstants.BUTTON_CREATE);
        click(ProductsConstants.BUTTON_CREATE);
    }

}
