package com.steve.creact.processor.core.factory;


import com.steve.creact.processor.core.ViewGenerator;
import com.steve.creact.processor.core.impl.ViewGeneratorImpl;

/**
 * Created by Administrator on 2016/4/10.
 */
public class ViewGeneratorFactory {

    private ViewGeneratorFactory() {
    }

    public static ViewGenerator getGenerator(Class<? extends ViewGenerator> clz) {

        ViewGenerator viewGenerator = null;
        try {
            viewGenerator = clz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if (viewGenerator == null)
            viewGenerator = new ViewGeneratorImpl();
        return viewGenerator;
    }
}
