/*
 * Copyright © 2015 | Alexander01998 | All rights reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tk.wurst_client.robot_launcher;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class MainFrame extends JFrame
{
	private JTextField txtExecuteCommand;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					UIManager.setLookAndFeel(UIManager
						.getSystemLookAndFeelClassName());
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public MainFrame()
	{
		setBounds(100, 100, 450, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Status", TitledBorder.LEADING,
			TitledBorder.TOP, null, null));
		getContentPane().setLayout(new MigLayout("", "[grow 1]", "[][]"));
		getContentPane().add(panel, "flowx,cell 0 0,grow");
		panel.setLayout(new MigLayout("", "[grow 1][grow 1]", "[][][][][]"));
		
		JLabel lblAlts = new JLabel("Alts:");
		panel.add(lblAlts, "cell 0 0");
		
		JLabel label = new JLabel("0");
		panel.add(label, "cell 1 0");
		
		JLabel lblProxies = new JLabel("Proxies:");
		panel.add(lblProxies, "cell 0 1");
		
		JLabel label_1 = new JLabel("0");
		panel.add(label_1, "cell 1 1");
		
		JLabel lblActiveWurstbots = new JLabel("Active Wurst-Bots:");
		panel.add(lblActiveWurstbots, "cell 0 2");
		
		JLabel label_2 = new JLabel("0");
		panel.add(label_2, "cell 1 2");
		
		JLabel lblCurrentServer = new JLabel("Current Server:");
		panel.add(lblCurrentServer, "cell 0 3");
		
		JLabel label_3 = new JLabel("127.0.0.1:25565");
		panel.add(label_3, "cell 1 3");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Controls", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setLayout(new MigLayout("", "[grow 1][grow 1][grow 1][grow 1][grow 1][grow 1]", "[grow 1][grow 1][grow 1][grow 1][grow 1][grow 1]"));
		
		JButton btnAddAlt = new JButton("Add Alt");
		panel_1.add(btnAddAlt, "cell 0 0 3 1,growx");
		
		JButton btnAddAltList = new JButton("Add Alt List");
		panel_1.add(btnAddAltList, "cell 3 0 3 1,growx");
		
		JButton btnAddProxy = new JButton("Add Proxy");
		panel_1.add(btnAddProxy, "cell 0 1 2 1,growx");
		
		JButton btnAddProxyList = new JButton("Add Proxy List");
		panel_1.add(btnAddProxyList, "cell 2 1 2 1,growx");
		
		JButton btnSearchProxies = new JButton("Search Proxies");
		panel_1.add(btnSearchProxies, "cell 4 1 2 1,growx");
		
		JButton btnAddBot = new JButton("Add Bot");
		panel_1.add(btnAddBot, "cell 0 2 2 1,growx");
		
		JButton btnRemoveBot = new JButton("Remove Bot");
		panel_1.add(btnRemoveBot, "cell 2 2 2 1,growx");
		
		JButton btnChangeServer = new JButton("Change Server");
		panel_1.add(btnChangeServer, "cell 4 2 2 1,growx");
		
		JLabel lblExecuteCommand = new JLabel("Execute command:");
		panel_1.add(lblExecuteCommand, "cell 0 3 6 1,growx");
		
		txtExecuteCommand = new JTextField();
		panel_1.add(txtExecuteCommand, "cell 0 4 6 1,growx");
		txtExecuteCommand.setColumns(100);
		getContentPane().add(panel_1, "cell 0 1,grow");
		
	}
}
