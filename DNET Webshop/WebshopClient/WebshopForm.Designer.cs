namespace WebshopClient
{
    partial class WebshopForm
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
            this.shopListBox = new System.Windows.Forms.ListBox();
            this.ownListBox = new System.Windows.Forms.ListBox();
            this.shopLabel = new System.Windows.Forms.Label();
            this.ownLabel = new System.Windows.Forms.Label();
            this.moneyLabel = new System.Windows.Forms.Label();
            this.buyButton = new System.Windows.Forms.Button();
            this.refreshButton = new System.Windows.Forms.Button();
            this.logoutButton = new System.Windows.Forms.Button();
            this.messageLabel = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // shopListBox
            // 
            this.shopListBox.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.shopListBox.FormattingEnabled = true;
            this.shopListBox.ItemHeight = 19;
            this.shopListBox.Location = new System.Drawing.Point(12, 41);
            this.shopListBox.Name = "shopListBox";
            this.shopListBox.Size = new System.Drawing.Size(212, 175);
            this.shopListBox.TabIndex = 0;
            this.shopListBox.SelectedIndexChanged += new System.EventHandler(this.shopListBox_SelectedIndexChanged);
            // 
            // ownListBox
            // 
            this.ownListBox.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ownListBox.FormattingEnabled = true;
            this.ownListBox.ItemHeight = 19;
            this.ownListBox.Location = new System.Drawing.Point(291, 41);
            this.ownListBox.Name = "ownListBox";
            this.ownListBox.SelectionMode = System.Windows.Forms.SelectionMode.None;
            this.ownListBox.Size = new System.Drawing.Size(218, 175);
            this.ownListBox.TabIndex = 1;
            this.ownListBox.SelectedIndexChanged += new System.EventHandler(this.ownListBox_SelectedIndexChanged);
            // 
            // shopLabel
            // 
            this.shopLabel.AutoSize = true;
            this.shopLabel.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.shopLabel.Location = new System.Drawing.Point(8, 19);
            this.shopLabel.Name = "shopLabel";
            this.shopLabel.Size = new System.Drawing.Size(105, 19);
            this.shopLabel.TabIndex = 2;
            this.shopLabel.Text = "Shop inventory";
            // 
            // ownLabel
            // 
            this.ownLabel.AutoSize = true;
            this.ownLabel.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ownLabel.Location = new System.Drawing.Point(287, 19);
            this.ownLabel.Name = "ownLabel";
            this.ownLabel.Size = new System.Drawing.Size(103, 19);
            this.ownLabel.TabIndex = 3;
            this.ownLabel.Text = "Own inventory";
            // 
            // moneyLabel
            // 
            this.moneyLabel.AutoSize = true;
            this.moneyLabel.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.moneyLabel.Location = new System.Drawing.Point(12, 219);
            this.moneyLabel.Name = "moneyLabel";
            this.moneyLabel.Size = new System.Drawing.Size(96, 19);
            this.moneyLabel.TabIndex = 4;
            this.moneyLabel.Text = "Money left: €";
            // 
            // buyButton
            // 
            this.buyButton.AutoSize = true;
            this.buyButton.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buyButton.Location = new System.Drawing.Point(12, 272);
            this.buyButton.Name = "buyButton";
            this.buyButton.Size = new System.Drawing.Size(75, 29);
            this.buyButton.TabIndex = 5;
            this.buyButton.Text = "Buy";
            this.buyButton.UseVisualStyleBackColor = true;
            this.buyButton.Click += new System.EventHandler(this.buyButton_Click);
            // 
            // refreshButton
            // 
            this.refreshButton.AutoSize = true;
            this.refreshButton.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.refreshButton.Location = new System.Drawing.Point(149, 272);
            this.refreshButton.Name = "refreshButton";
            this.refreshButton.Size = new System.Drawing.Size(75, 29);
            this.refreshButton.TabIndex = 6;
            this.refreshButton.Text = "Refresh";
            this.refreshButton.UseVisualStyleBackColor = true;
            this.refreshButton.Click += new System.EventHandler(this.refreshButton_Click);
            // 
            // logoutButton
            // 
            this.logoutButton.AutoSize = true;
            this.logoutButton.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.logoutButton.Location = new System.Drawing.Point(434, 251);
            this.logoutButton.Name = "logoutButton";
            this.logoutButton.Size = new System.Drawing.Size(75, 29);
            this.logoutButton.TabIndex = 7;
            this.logoutButton.Text = "Logout";
            this.logoutButton.UseVisualStyleBackColor = true;
            this.logoutButton.Click += new System.EventHandler(this.logoutButton_Click);
            // 
            // messageLabel
            // 
            this.messageLabel.AutoSize = true;
            this.messageLabel.Font = new System.Drawing.Font("Calibri Light", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.messageLabel.ForeColor = System.Drawing.Color.Red;
            this.messageLabel.Location = new System.Drawing.Point(12, 250);
            this.messageLabel.Name = "messageLabel";
            this.messageLabel.Size = new System.Drawing.Size(0, 19);
            this.messageLabel.TabIndex = 8;
            this.messageLabel.Visible = false;
            // 
            // WebshopForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.LightSkyBlue;
            this.ClientSize = new System.Drawing.Size(522, 313);
            this.Controls.Add(this.messageLabel);
            this.Controls.Add(this.logoutButton);
            this.Controls.Add(this.refreshButton);
            this.Controls.Add(this.buyButton);
            this.Controls.Add(this.moneyLabel);
            this.Controls.Add(this.ownLabel);
            this.Controls.Add(this.shopLabel);
            this.Controls.Add(this.ownListBox);
            this.Controls.Add(this.shopListBox);
            this.Name = "WebshopForm";
            this.Text = "Webshop";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox shopListBox;
        private System.Windows.Forms.ListBox ownListBox;
        private System.Windows.Forms.Label shopLabel;
        private System.Windows.Forms.Label ownLabel;
        private System.Windows.Forms.Label moneyLabel;
        private System.Windows.Forms.Button buyButton;
        private System.Windows.Forms.Button refreshButton;
        private System.Windows.Forms.Button logoutButton;
        private System.Windows.Forms.Label messageLabel;
    }
}