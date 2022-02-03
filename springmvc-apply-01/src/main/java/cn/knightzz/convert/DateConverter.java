package cn.knightzz.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 王天赐
 * @title: DateConverter
 * @projectName springmvc-apply-01
 * @description: 日期转换类
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/2 12:20
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(s);
            System.out.println(date);
            System.out.println(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
}
