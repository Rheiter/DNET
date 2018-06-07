namespace WebshopClient
{
    partial class LoginForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.tabControl = new System.Windows.Forms.TabControl();
            this.loginTab = new System.Windows.Forms.TabPage();
            this.loginErrorLabel = new System.Windows.Forms.Label();
            this.loginButton = new System.Windows.Forms.Button();
            this.loginPasswordTextBox = new System.Windows.Forms.TextBox();
            this.loginPasswordLabel = new System.Windows.Forms.Label();
            this.loginUsernameLabel = new System.Windows.Forms.Label();
            this.loginUsernameTextBox = new System.Windows.Forms.TextBox();
            this.registerTab = new System.Windows.Forms.TabPage();
            this.registerPasswordLabel = new System.Windows.Forms.Label();
            this.registerErrorLabel = new System.Windows.Forms.Label();
            this.registerButton = new System.Windows.Forms.Button();
            this.registerUsernameLabel = new System.Windows.Forms.Label();
            this.registerUsernameTextBox = new System.Windows.Forms.TextBox();
            this.tabControl.SuspendLayout();
            this.loginTab.SuspendLayout();
            this.registerTab.SuspendLayout();
            this.SuspendLayout();
            // 
            // tabControl
            // 
            this.tabControl.Controls.Add(this.loginTab);
            this.tabControl.Controls.Add(this.registerTab);
            this.tabControl.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tabControl.Location = new System.Drawing.Point(0, 0);
            this.tabControl.Name = "tabControl";
            this.tabControl.SelectedIndex = 0;
            this.tabControl.Size = new System.Drawing.Size(377, 259);
            this.tabControl.TabIndex = 0;
            // 
            // loginTab
            // 
            this.loginTab.BackColor = System.Drawing.Color.LightSkyBlue;
            this.loginTab.Controls.Add(this.loginErrorLabel);
            this.loginTab.Controls.Add(this.loginButton);
            this.loginTab.Controls.Add(this.loginPasswordTextBox);
            this.loginTab.Controls.Add(this.loginPasswordLabel);
            this.loginTab.Controls.Add(this.loginUsernameLabel);
            this.loginTab.Controls.Add(this.loginUsernameTextBox);
            this.loginTab.Location = new System.Drawing.Point(4, 22);
            this.loginTab.Name = "loginTab";
            this.loginTab.Padding = new System.Windows.Forms.Padding(3);
            this.loginTab.Size = new System.Drawing.Size(369, 233);
            this.loginTab.TabIndex = 0;
            this.loginTab.Text = "Login";
            // 
            // loginErrorLabel
            // 
            this.loginErrorLabel.AutoSize = true;
            this.loginErrorLabel.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.loginErrorLabel.ForeColor = System.Drawing.Color.Red;
            this.loginErrorLabel.Location = new System.Drawing.Point(36, 138);
            this.loginErrorLabel.Name = "loginErrorLabel";
            this.loginErrorLabel.Size = new System.Drawing.Size(294, 19);
            this.loginErrorLabel.TabIndex = 6;
            this.loginErrorLabel.Text = "Incorrect username/password combination!";
            this.loginErrorLabel.Visible = false;
            // 
            // loginButton
            // 
            this.loginButton.AutoSize = true;
            this.loginButton.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.loginButton.Location = new System.Drawing.Point(255, 170);
            this.loginButton.Name = "loginButton";
            this.loginButton.Size = new System.Drawing.Size(75, 29);
            this.loginButton.TabIndex = 5;
            this.loginButton.Text = "Login";
            this.loginButton.UseVisualStyleBackColor = true;
            this.loginButton.Click += new System.EventHandler(this.loginButton_Click);
            // 
            // loginPasswordTextBox
            // 
            this.loginPasswordTextBox.Font = new System.Drawing.Font("Calibri Light", 12F);
            this.loginPasswordTextBox.Location = new System.Drawing.Point(162, 90);
            this.loginPasswordTextBox.Name = "loginPasswordTextBox";
            this.loginPasswordTextBox.Size = new System.Drawing.Size(168, 27);
            this.loginPasswordTextBox.TabIndex = 4;
            this.loginPasswordTextBox.UseSystemPasswordChar = true;
            // 
            // loginPasswordLabel
            // 
            this.loginPasswordLabel.AutoSize = true;
            this.loginPasswordLabel.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.loginPasswordLabel.Location = new System.Drawing.Point(42, 93);
            this.loginPasswordLabel.Name = "loginPasswordLabel";
            this.loginPasswordLabel.Size = new System.Drawing.Size(74, 19);
            this.loginPasswordLabel.TabIndex = 3;
            this.loginPasswordLabel.Text = "Password:";
            // 
            // loginUsernameLabel
            // 
            this.loginUsernameLabel.AutoSize = true;
            this.loginUsernameLabel.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.loginUsernameLabel.Location = new System.Drawing.Point(42, 41);
            this.loginUsernameLabel.Name = "loginUsernameLabel";
            this.loginUsernameLabel.Size = new System.Drawing.Size(80, 19);
            this.loginUsernameLabel.TabIndex = 2;
            this.loginUsernameLabel.Text = "Username:";
            // 
            // loginUsernameTextBox
            // 
            this.loginUsernameTextBox.Font = new System.Drawing.Font("Calibri Light", 12F);
            this.loginUsernameTextBox.Location = new System.Drawing.Point(162, 38);
            this.loginUsernameTextBox.Name = "loginUsernameTextBox";
            this.loginUsernameTextBox.Size = new System.Drawing.Size(168, 27);
            this.loginUsernameTextBox.TabIndex = 0;
            // 
            // registerTab
            // 
            this.registerTab.BackColor = System.Drawing.Color.LightSkyBlue;
            this.registerTab.Controls.Add(this.registerPasswordLabel);
            this.registerTab.Controls.Add(this.registerErrorLabel);
            this.registerTab.Controls.Add(this.registerButton);
            this.registerTab.Controls.Add(this.registerUsernameLabel);
            this.registerTab.Controls.Add(this.registerUsernameTextBox);
            this.registerTab.Location = new System.Drawing.Point(4, 22);
            this.registerTab.Name = "registerTab";
            this.registerTab.Padding = new System.Windows.Forms.Padding(3);
            this.registerTab.Size = new System.Drawing.Size(369, 233);
            this.registerTab.TabIndex = 1;
            this.registerTab.Text = "Register";
            // 
            // registerPasswordLabel
            // 
            this.registerPasswordLabel.AutoSize = true;
            this.registerPasswordLabel.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.registerPasswordLabel.ForeColor = System.Drawing.SystemColors.ControlText;
            this.registerPasswordLabel.Location = new System.Drawing.Point(42, 91);
            this.registerPasswordLabel.Name = "registerPasswordLabel";
            this.registerPasswordLabel.Size = new System.Drawing.Size(0, 19);
            this.registerPasswordLabel.TabIndex = 8;
            this.registerPasswordLabel.Visible = false;
            // 
            // registerErrorLabel
            // 
            this.registerErrorLabel.AutoSize = true;
            this.registerErrorLabel.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.registerErrorLabel.ForeColor = System.Drawing.Color.Red;
            this.registerErrorLabel.Location = new System.Drawing.Point(156, 139);
            this.registerErrorLabel.Name = "registerErrorLabel";
            this.registerErrorLabel.Size = new System.Drawing.Size(174, 19);
            this.registerErrorLabel.TabIndex = 7;
            this.registerErrorLabel.Text = "Username is unavailable!";
            this.registerErrorLabel.Visible = false;
            // 
            // registerButton
            // 
            this.registerButton.AutoSize = true;
            this.registerButton.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.registerButton.Location = new System.Drawing.Point(255, 171);
            this.registerButton.Name = "registerButton";
            this.registerButton.Size = new System.Drawing.Size(75, 29);
            this.registerButton.TabIndex = 6;
            this.registerButton.Text = "Register";
            this.registerButton.UseVisualStyleBackColor = true;
            this.registerButton.Click += new System.EventHandler(this.registerButton_Click);
            // 
            // registerUsernameLabel
            // 
            this.registerUsernameLabel.AutoSize = true;
            this.registerUsernameLabel.Font = new System.Drawing.Font("Calibri Light", 12F);
            this.registerUsernameLabel.Location = new System.Drawing.Point(42, 41);
            this.registerUsernameLabel.Name = "registerUsernameLabel";
            this.registerUsernameLabel.Size = new System.Drawing.Size(80, 19);
            this.registerUsernameLabel.TabIndex = 4;
            this.registerUsernameLabel.Text = "Username:";
            // 
            // registerUsernameTextBox
            // 
            this.registerUsernameTextBox.Font = new System.Drawing.Font("Calibri Light", 12F);
            this.registerUsernameTextBox.Location = new System.Drawing.Point(162, 38);
            this.registerUsernameTextBox.Name = "registerUsernameTextBox";
            this.registerUsernameTextBox.Size = new System.Drawing.Size(168, 27);
            this.registerUsernameTextBox.TabIndex = 3;
            // 
            // LoginForm
            // 
            this.BackColor = System.Drawing.SystemColors.Control;
            this.ClientSize = new System.Drawing.Size(377, 259);
            this.Controls.Add(this.tabControl);
            this.Name = "LoginForm";
            this.Text = "Login";
            this.Load += new System.EventHandler(this.LoginForm_Load);
            this.tabControl.ResumeLayout(false);
            this.loginTab.ResumeLayout(false);
            this.loginTab.PerformLayout();
            this.registerTab.ResumeLayout(false);
            this.registerTab.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TabControl tabControl;
        private System.Windows.Forms.TabPage loginTab;
        private System.Windows.Forms.TabPage registerTab;
        private System.Windows.Forms.Button loginButton;
        private System.Windows.Forms.TextBox loginPasswordTextBox;
        private System.Windows.Forms.Label loginPasswordLabel;
        private System.Windows.Forms.Label loginUsernameLabel;
        private System.Windows.Forms.TextBox loginUsernameTextBox;
        private System.Windows.Forms.Label registerUsernameLabel;
        private System.Windows.Forms.TextBox registerUsernameTextBox;
        private System.Windows.Forms.Button registerButton;
        private System.Windows.Forms.Label loginErrorLabel;
        private System.Windows.Forms.Label registerErrorLabel;
        private System.Windows.Forms.Label registerPasswordLabel;
    }
}

