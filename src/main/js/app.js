const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {tasks: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/tasks'}).done(response => {
			this.setState({tasks: response.entity._embedded.tasks});
		});
	}

	render() {
		return (
			<TaskList tasks={this.state.tasks}/>
		)
	}
}

class TaskList extends React.Component{
	render() {
		const tasks = this.props.tasks.map(task =>
			<Task key={task._links.self.href} task={task}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Objective</th>
						<th>Reward</th>
					</tr>
					{tasks}
				</tbody>
			</table>
		)
	}
}

class Task extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.task.objective}</td>
				<td>{this.props.task.reward}</td>
			</tr>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)