package model.html;

import java.util.ArrayList;

/**
 * @since 21.04.2014
 * @author Julian Schelker
 */
public class HtmlTable {

	/**
	 * is there a defined value for the number of columns
	 */
	private boolean columnSizeSet;
	private ArrayList<ArrayList<String>> content;
	private int rowIndex;
	private int columnSize;

	public HtmlTable() {
		this(false, 0);
	}

	public HtmlTable(int columnSize) {
		this(true, columnSize);
	}

	private HtmlTable(boolean columnSizeSet, int columnSize) {
		this.columnSizeSet = columnSizeSet;
		this.columnSize = columnSize;
		this.content = new ArrayList<ArrayList<String>>();
		this.rowIndex = 0;
	}

	public void addTd(String content) {
		if (this.content.size() <= this.rowIndex)
			this.content.add(this.rowIndex, new ArrayList<String>());
		this.content.get(this.rowIndex).add(content);
		if (this.columnSizeSet
			&& this.content.get(this.rowIndex).size() == this.columnSize)
			this.rowIndex++;
	}

	public void addTr() {
		this.rowIndex++;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("<table>");
		for (ArrayList<String> row : this.content) {
			result.append("<tr>");
			for (String content : row) {
				result.append("<td>" + content + "</td>");
			}
			result.append("</tr>");
		}
		result.append("</table>");
		return result.toString();
	}
}
