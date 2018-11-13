/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

/**
 *
 * @author 59160929
 */
public class ReviewPostService {

    ReviewPostDao reviewPostDao = new ReviewPostDao();

    public static String avgPoint(int IDRestaurant) throws SQLException {
        float count = 0;
        float point = 0;

        String keepIDrestaurant = "" + IDRestaurant;
        String totalavarage;
        ReviewPostDao reviewPostDao = new ReviewPostDao();

        count = reviewPostDao.getCount(keepIDrestaurant) + count;
        point = reviewPostDao.getPoint(keepIDrestaurant) + point;
        if (count == 0) {
            totalavarage = "no point";
        } else {
            float average = point / count;
            DecimalFormat changeformat = new DecimalFormat("#.##");
            totalavarage = changeformat.format(average);

        }

        return totalavarage;

    }

    public static boolean sumPointAndCountToDB(int IDRestaurant, int count, int point) throws SQLException {

        String keepIDrestaurant = "" + IDRestaurant;
        int getcount = ReviewPostDao.getCount(keepIDrestaurant);
        count = getcount + count;
        int getpoint = ReviewPostDao.getPoint(keepIDrestaurant);
        point = getpoint + point;

        ReviewPostDao.updatePointAndCount(keepIDrestaurant, count, point);

        return true;

    }
}
