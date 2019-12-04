package com.dicoding.mysubmissionapps2;

import java.util.ArrayList;

public class BurgerData {
    private static String[] burgerName = {
            "Wagyu Burger",
            "Three Degree Burn Burger",
            "California Roll Burger",
            "Ultimate Burger",
            "Beef Burger",
            "Mini Beef Burger",
            "Hollandaise Burger",
            "Mushroom Onion Burger",
            "Original Butter Burger",
            "Cheese Burger"
    };

    private static String[] burgerDetails = {
            "Burger yang disajikan dengan saus sambal Thailand dicampur dengan sour cream. Pastinya akan membuat lidah anda merasakan sensasi kenikmatan unik saat anda mengunyahnya bersama kentang goreng yang digoreng kecoklatan. Lebih lagi, Mozarella gratin yang diletakan di atas daging Wagyu membuat anda lebih pasti untuk menambah porsi anda” Seperti dilansir oleh salah seorang customer Qraved.",
            "Burger yang disajikan dengan teknik khas pengolahan khusus untuk rasa pedas. Burger ini sangat cocok untuk dimakan oleh penggemar rasa pedas. Dengan saus mayonais yang creamy dan cabai asli, sudah sangat cukup untuk membuat lidah anda menari-nari",
            "Topping yang biasa disajikan di sushi seperti crab mayo patty, dapat ditemukan di sini. Bayangkan mengunyah patty yang juicy itu dengan topping senikmat crab mayo dari Sushi.",
            "Burger yang disajikan dengan 2 buah Fire Grilled yang tebal dan juicy. Ditemani dengan 4 Crispy Cajun Battered Onion Rings yang akan memanjakan lidah anda.",
            "Burger yang disajikan dengan Burger Patties dengan daging sapi kualitas baik Sehat tanpa MSG, tanpa Pengawet dan tanpa Pewarna.",
            "Burger yang disajikan dengan lumer keju yang dapat membuat banyak kaum hawa anti dengan makanan yang satu ini.",
            "Burger yang disajikan dengan bahan rempah-rempah dari negara Kincir Angin/Belanda , aroma dan gaya Burger yang khas akan Holland dijamin akan membuat kamu ketagihan dengan rasanya.",
            "Burger yang disajikan melalui perpaduan daging sapi panggang dengan jamur panggang ditambah bawang Bombay. Aroma khas bawang bombaynya hmmm enakkkk",
            "Burger yang satu menawarkan sajian daging sapi yang fresh dengan tingkat kematangan sempurna.",
            "Burger yang disajikan dengan daging sapi ditambah keju dalam porsi yang 2x lipat lebih besar dari Beef Burger biasanya, dijamin pasti akan membuat kamu kekenyangan."
    };

    private static int[] burgerImages = {
            R.drawable.wagyubeefburger,
            R.drawable.threedegreeburger,
            R.drawable.californiarollburger,
            R.drawable.ultimateburger,
            R.drawable.beefburger,
            R.drawable.minibeefburger,
            R.drawable.hollandburger,
            R.drawable.mushroomburger,
            R.drawable.originalbutterburger,
            R.drawable.cheeseburger
    };

    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int pos = 0; pos < burgerName.length; pos++) {
            Food burger = new Food();
            burger.setName(burgerName[pos]);
            burger.setDetail(burgerDetails[pos]);
            burger.setPhotos(burgerImages[pos]);
            list.add(burger);
        }
        return list;
    }
}
