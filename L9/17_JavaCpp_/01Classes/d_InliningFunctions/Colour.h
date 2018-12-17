//[Colour.h]
class Colour
{
	public:
		Colour();
		int getRed() { return m_red; }       // inline declaration
		void setRed(int red) { m_red=red; }  // inline declaration
		/*... could declare same for green and blue etc.*/
	protected:
		int m_red, m_green, m_blue;
};