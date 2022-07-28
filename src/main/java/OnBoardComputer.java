public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        //a = (speed * speed)/(2 * altitude)
        int burn = ((status.Velocity * status.Velocity) / (2 * status.Altitude)) + 99;
        
        System.out.println(burn); /*hack!*/
        return burn;
    }

}
