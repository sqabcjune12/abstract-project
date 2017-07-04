/**
 * File Name: AbstractLoginTest.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jul 1, 2017
 */
package com.sqa.jf.helpers;

import com.sqa.jf.adactin.*;

/**
 * AbstractLoginTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public abstract class AbstractLoginTest extends BasicTest {

	public AbstractLoginTest(String baseUrl) {
		super(baseUrl);
	}

	abstract public void login(String username, String password);

	abstract public void logout();
}
