/**
 * This class models a car.
 *
 * @author gcschmit
 * @version 10 September 2018
 */
public class Car
{
    /*
     * Instance variables store the object's properties.
     *      specify the visibility (e.g., private)
     *          public: accessibly by anyone
     *          private: only accessible by methods in this class
     *      specify the type (e.g., double)
     *      specify the name (e.g., fuelEfficiency, fuelInTank)
     *      
     *  Instance variables differ from local variables in the
     *      following ways:
     *      scoped to their class (accessible for all methods)
     *      automatically initialized to a default value (0,
     *          false, null)
     */
    private double fuelEfficiency; // in units of miles per gallon
    private double fuelInTank; // in units of gallons
    private String vin; // vehicle indentification number
    
    /*
     * Constructor:
     *      responsible for initializing newly created objects
     *      invoked automatically via the new operator
     *      name of the contructor must match the name of the class
     *      has no return type (not even void)
     *      multiple constructors may be defined for a class
     *      one constructor may call another contructor
     *          (with restrictions)
     */
    
    /**
     * Default constructor for the Car class.
     *      Initializes the fuel efficiency to 30 mpg and the fuel
     *          in this car's tank to 0 gallons.
     */
    public Car()
    {
        /*
         * The "this" reserved word references the currect object
         *      (like "self" in Python)
         *  Its usage is encouraged but usually not required.
         */
        this.fuelEfficiency = 30;
        this.fuelInTank = 0;
        this.vin = null;
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
         *  To refer explicilty to an instance variable, use "this"
         *  Advice: avoid this issue by giving parameters and local
         *      variables unique names!
         */
        this.fuelEfficiency = initialEfficiency;
        this.fuelInTank = 0;
        this.vin = null;
    }
    
    /*
     * When defining a method, specify:
     *      the visibility (e.g., public)
     *      the return type (e.g., void)
     *      the method name (e.g., drive)
     *      the parameters and their types (e.g., distance of type
     *          double)
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
     * Returns the VIN of this car
     * 
     * @return the VIN of this car
     */
    public String getVIN()
    {
        return this.vin;
    }
    
    /**
     * Sets the VIN of this car
     * 
     * @param   newVIN    the VIN of this car
     */
    public void setVIN(String newVIN)
    {
        this.vin = newVIN;
    }
    
    /**
     * Returns a String that describes the state of this car
     * 
     * @return  a String that describes the state of this car
     */
    public String toString()
    {
        String str = "VIN: " + this.getVIN() +
                "; fuel efficiency: " + this.fuelEfficiency +
                " mpg; fuel in tank: " + this.getFuelInTank() + " gallons";
                
        return str;
    }
}




