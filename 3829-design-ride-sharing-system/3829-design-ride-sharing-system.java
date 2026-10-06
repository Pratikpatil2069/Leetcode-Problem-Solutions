class RideSharingSystem {
    Queue<Integer>ride;
    Queue<Integer>driver;
    public RideSharingSystem() {
        ride=new LinkedList<>();
        driver=new LinkedList<>();
    }
    
    public void addRider(int riderId) {
        ride.add(riderId);
    }
    
    public void addDriver(int driverId) {
        driver.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(ride.isEmpty() || driver.isEmpty()){
            return new int[]{-1,-1};
        }else{
            return new int[]{driver.poll(),ride.poll()};
        }
    }
    
    public void cancelRider(int riderId) {
        ride.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */