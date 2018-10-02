
/**
 * This class models a car.
 *
 * @author gcschmit
 * @version 10 September 2018
 */
public class Car
{
    /*
     * Instance variables store the object's properties
     *      specify the visibility (e.g., private)
     *          public: accessible by anyone
     *          private: only accessible by methods in this class
     *      specify the type (e.g., double)
     *      specify the name (e.g., fuelEfficienc, fuelInTank)
     *  
     *  Instance variables differ from local variables in the
     *      following ways:
     *      scoped to their class (accessible for all methods)
     *      automatically initialized to a default value (0, false, null)
     */
    private double fuelEfficiency; // in units of miles per gallon
    private double fuelInTank; // in units of gallons
    private String licensePlate;
    
    /*
     * Constructor:
     *      responsible for initializing newly created objects
     *      invoked automatically via new operator
     *      name of the constructor must match the name of class
     *      has no return type (not even void)
     *      multiple constructors may be defined for a class
     *      one constructor may call another constructor
     *          (with restrictions)
     */
    
    /**
     * Default constructor for the Car class
     *      Initializes the fuel efficiency to 30 mpg and the fuel
     *          in this car's tank to 0 gallons.
     */
    public Car()
    {
        /*
         * The "this" reserved word references the current object
         *      (like "self" in Python)
         *  Its usage is encouraged but usually not required
         */
        this.fuelEfficiency = 30;
        this.fuelInTank = 0;
        this.licensePlate = null;
    }
    
    /**
     * Constructs a new Car object with the specified fuel efficiency
     * 
     * @param   initialEfficiency   the initial fuel efficiency, in
     *                              miles per gallon, of this new car
     */
    public Car(double initialEfficiency)
    {
        /*
         * If the parameter was named fuelEfficiency, it would
         *      "shadow" the instance variable fuelEfficiency.
         *  Local and parameter variables "shadow" instance variables
         *      of the same name. In this code, fuelEfficiency would
         *      refer to the parameter and not the instance variable.
         *  To refer explicitly to an instance variable, use "this"
         *  Advice: avoid this issue by giving parameters and
         *      local variables unique names!
         */
        this.fuelEfficiency = initialEfficiency;
        this.fuelInTank = 0;
        this.licensePlate = null;
    }
    
    /*
     * When defining a method, specify:
     *      the visibility (e.g., public)
     *      the return type (e.g., void)
     *      the method name (e.g., drive)
     *      the parameters and their types (e.g., distance
     *          of type double)
     */
    
    /**
     * Drives this car the specified distance, consuming fuel
     * 
     * @param   distance    the distance, in miles, this car drives
     */
    public void drive(double distance)
    {
        double fuelConsumed = distance / this.fuelEfficiency;
        this.fuelInTank -= fuelConsumed;
    }
    
    /**
     * Adds the specified amount of fuel to this car's tank
     * 
     * @param   amount  the amount of fuel, in gallons, to add to
     *                  this car's tank
     */
    public void addFuel(double amount)
    {
        this.fuelInTank += amount;
    }
    
    /**
     * Returns the amount of fuel in this car's tank
     * 
     * @return the amount of fuel, in gallons, in this car's tank
     */
    public double getFuelInTank()
    {
        return this.fuelInTank;
    }
    
    /**
     * Gets the license plate of this car
     * 
     * @return the license plate of this car
     */
    public String getLicensePlate()
    {
        return this.licensePlate;
    }
    
    /**
     * Sets the license plate of this car
     * 
     * @param   plate   the license plate of this car
     */
    public void setLicensePlate(String plate)
    {
        this.licensePlate = plate;
    }
    
    /**
     * Returns a String describing the state of this car
     * 
     * @returns     a String describing the state of this car
     */
    public String toString()
    {
        String str = "License plate: " + this.getLicensePlate() +
                "; fuel efficiency: " + this.fuelEfficiency +
                " mpg; fuel in tank: " + this.getFuelInTank() + " gallons";
        
        return str;
    }
}
