#include <string>
class Dog{
	public:
		Dog(std::string aName); //constructor
		~Dog() ;				//destructor
		Dog(const Dog *dref); 	//copy constructor
		Dog& operator = (const Dog &doper);
		void setName(std::string aName);
		std::string getName();
		void setCuteness(int cute);
		int getCuteness();

	private:
		std::string name;
		int cuteness;
		bool isFluffy;
};