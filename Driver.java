import FrequentRenterPointStrategy.Movie.AgeFrequentPoints;
import FrequentRenterPointStrategy.Movie.NewReleaseFrequentPoints;
import FrequentRenterPointStrategy.Movie.RegularFrequentPoints;
import FrequentRenterPointStrategy.Movie.TwoMovieTypesFrequentPoints;
import FrequentRenterPointStrategy.VideoGame.OpenWorldFrequentPoints;
import Item.Item;
import Item.Movie;
import TransactionItems.Purchase;
import TransactionItems.Rental;
import strategies.PurchaseStrategies.MoviePurchaseStrategies.ChildrenMoviePurchase;
import strategies.PurchaseStrategies.MusicPurchase.AlbumPurchaseStrategy;
import strategies.PurchaseStrategies.MusicPurchase.SinglePurchaseStrategy;
import strategies.PurchaseStrategies.VideoGamePurchase.SpecialGamesPurchaseStrategy;
import strategies.RentalStrategies.MovieRentalStrategies.NewReleaseMovieRental;
import strategies.RentalStrategies.MovieRentalStrategies.RegularMovieRental;

import java.util.HashSet;
import java.util.Set;

import static Item.Movie.MovieCategory.*;
import static Item.MusicCD.Category.ALBUM;
import static Item.MusicCD.Category.SINGLE_SONG;
import static Item.VideoGame.VideoGameCategory.FPS;
import static Item.VideoGame.VideoGameCategory.OPEN_WORLD;

import Item.MusicCD;
import Item.VideoGame;
import strategies.RentalStrategies.VideoGameRental.OpenWorldRental;

public class Driver {
    public static void main(String[] args){
        Customer customer = new Customer("Teju");
        customer.setAge(19);

        Set<String> itemRentalSet = new HashSet<>();

        Item m1 = new Movie("Back to the Future", REGULAR);
        Item m2 = new Movie("Raya and the Last Dragon", NEW_RELEASE);
        Item m3 = new Movie("Cars", CHILDREN_MOVIE);

        Transaction transaction = new Transaction(customer);

        transaction.addItem(new Rental(m1, 2, new RegularMovieRental()));
        itemRentalSet.add(REGULAR.toString());
        transaction.addFrequentRenterPoints(new RegularFrequentPoints(), 2);

        transaction.addItem(new Rental(m2, 3, new NewReleaseMovieRental()));
        itemRentalSet.add(NEW_RELEASE.toString());
        transaction.addFrequentRenterPoints(new NewReleaseFrequentPoints(), 3);

        if(itemRentalSet.size() > 1){
            transaction.addFrequentRenterPoints(new TwoMovieTypesFrequentPoints(), 0);
        }
        if(customer.getAge() > 17 && customer.getAge() < 23 && itemRentalSet.contains(NEW_RELEASE.toString())){
            transaction.addFrequentRenterPoints(new AgeFrequentPoints(), 0);
        }

        transaction.addItem(new Purchase(m3), new ChildrenMoviePurchase());

        Item musicCD1 = new MusicCD("Anyone", SINGLE_SONG);
        Item musicCD2 = new MusicCD("Evermore", ALBUM);

        transaction.addItem(new Purchase(musicCD2), new AlbumPurchaseStrategy());
        transaction.addItem(new Purchase(musicCD1), new SinglePurchaseStrategy());

        Item videoGame1 = new VideoGame("Legend of Zelda", OPEN_WORLD);
        Item videoGame2 = new VideoGame("Call of Duty", FPS);

        transaction.addItem(new Rental(videoGame1, 10, new OpenWorldRental()));
        itemRentalSet.add(OPEN_WORLD.toString());
        transaction.addFrequentRenterPoints(new OpenWorldFrequentPoints(), 10);

        transaction.addItem(new Purchase(videoGame2), new SpecialGamesPurchaseStrategy());


        System.out.println(transaction.generateBill());
    }

}
