package Model;

import java.util.ArrayList;

import java.sql.*;
import java.util.*;

public class TrainDatabase {
    JdbcConnection database = new JdbcConnection();

    public void updateTrainlist(ArrayList<TrainInformation> trainlist) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sampletrain", "root",
                "Chrisevans@2309")) {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO train"
                            + "(Trainno ,departure,arrival,lowerberthseat,upperberthseat,midberthseat,racberthseat,wlberthseat,lbticketcost,upbticketcost,mbticketcost,racbticketcost,wlticketcost) values "
                            + "(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            // Connection connection=database.getConnection();

            // String sql= "INSERT INTO train" + "(Trainno
            // ,trainroute,lowerberth,upperberth,midberth,racberth,wlberth) values "
            // + "(?,?,?,?,?,?,?)";
            // PreparedStatement preparedstatement=database.putData(sql);
            for (Iterator<TrainInformation> iterator = trainlist.iterator(); iterator.hasNext();) {
                TrainInformation trains = (TrainInformation) iterator.next();
                statement.setInt(1, trains.getTrainNo());
                statement.setString(2, trains.getDeparture());
                statement.setString(3, trains.getArrival());
                statement.setInt(4, trains.getUpperberthSeat());
                statement.setInt(5, trains.getLowerberthSeat());
                statement.setInt(6, trains.getMiddleberthSeat());
                statement.setInt(7, trains.getRacberthSeat());
                statement.setInt(8, trains.getWaitingList());
                statement.setInt(9, trains.getUpperberthCost());
                statement.setInt(10, trains.getLowerberthCost());
                statement.setInt(11, trains.getMiddleberthCost());
                statement.setInt(12, trains.getRacberthCost());
                statement.setInt(13, trains.getWaitingListCost());

                statement.addBatch();
            }
            int[] count = statement.executeBatch();
            System.out.println(Arrays.toString(count));
        }

    }
}
