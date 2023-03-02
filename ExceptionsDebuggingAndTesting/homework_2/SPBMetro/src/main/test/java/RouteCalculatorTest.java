import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RouteCalculatorTest extends TestCase {
    List<Station> route;
    List<Station> connection1_2;
    List<Station> connection2_3;
    StationIndex stationIndex = new StationIndex();


    @Override
    protected void setUp() throws Exception {
        route = new ArrayList<>();
        connection1_2 = new ArrayList<>();
        connection2_3 = new ArrayList<>();

        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");

        Station station1 = new Station("Парнас", line1);
        Station station2 = new Station("Парголово", line1);
        Station station3 = new Station("Просвет", line1);
        Station station4 = new Station("Василеостровская", line2);
        Station station5 = new Station("Выборгская", line2);
        Station station6 = new Station("Владимирская", line2);
        Station station7 = new Station("Московская", line3);
        Station station8 = new Station("Международная", line3);
        Station station9 = new Station("Московские Ворота", line3);

        route.add(station1);
        route.add(station2);
        route.add(station3);
        route.add(station4);
        route.add(station5);
        route.add(station6);
        route.add(station7);
        route.add(station8);
        route.add(station9);
        line1.addStation(station1);
        line1.addStation(station2);
        line1.addStation(station3);
        line2.addStation(station4);
        line2.addStation(station5);
        line2.addStation(station6);
        line3.addStation(station7);
        line3.addStation(station8);
        line3.addStation(station9);
        connection1_2.add(station3);
        connection1_2.add(station4);
        connection2_3.add(station6);
        connection2_3.add(station7);
        stationIndex.addConnection(connection1_2);
        stationIndex.addConnection(connection2_3);
        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);
        stationIndex.addStation(station1);
        stationIndex.addStation(station2);
        stationIndex.addStation(station3);
        stationIndex.addStation(station4);
        stationIndex.addStation(station5);
        stationIndex.addStation(station6);
        stationIndex.addStation(station7);
        stationIndex.addStation(station8);
        stationIndex.addStation(station9);
    }

    public void testCalculatDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 22.0;
        assertEquals(expected, actual);
    }

    public void testGetRouteOnTheLine() {
        RouteCalculator routeCalculator = new RouteCalculator(stationIndex);
        Station from = stationIndex.getStation("Парнас",1);
        Station to = stationIndex.getStation("Парголово",1);
        List<Station> extend = Arrays.asList(route.get(0),route.get(1));
        List<Station> actual = routeCalculator.getShortestRoute(from,to);
        assertEquals(extend,actual);
    }

    public void testRouteWithOneConnection(){
        RouteCalculator routeCalculator = new RouteCalculator(stationIndex);
        Station from = stationIndex.getStation("Парнас",1);
        Station to = stationIndex.getStation("Выборгская",2);
        List<Station> extend = Arrays.asList(
                route.get(0),route.get(1),connection1_2.get(0),connection1_2.get(1),route.get(4));
        List<Station> actual = routeCalculator.getShortestRoute(from,to);
        assertEquals(extend,actual);

    }
    public void testGetRouteWithTwoConnections(){
        RouteCalculator routeCalculator = new RouteCalculator(stationIndex);
        Station from = stationIndex.getStation("Парнас",1);
        Station to = stationIndex.getStation("Международная",3);
        List<Station> extend = Arrays.asList(
                route.get(0),route.get(1),connection1_2.get(0),connection1_2.get(1),route.get(4),
                connection2_3.get(0),connection2_3.get(1),route.get(7));
        List<Station> actual = routeCalculator.getShortestRoute(from,to);
        assertEquals(extend,actual);
    }
    @Override
    protected void tearDown() throws Exception {

    }
}
